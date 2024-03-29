package com.market.ex.market.persistence;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.market.ex.market.domain.Product;
import com.market.ex.market.domain.repository.ProductRepository;
import com.market.ex.market.persistence.crud.ProductoCrudRepository;
import com.market.ex.market.persistence.entity.Producto;
import com.market.ex.market.persistence.mapper.ProductMapper;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }
    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }
    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(producto -> mapper.toProducts(producto));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        Optional<Producto> producto = productoCrudRepository.findById(productId);
        return producto.map(product -> mapper.toProduct(product));
    }
    @Override
    public Product save(Product product) {
        if(product == null) throw new IllegalArgumentException("Product cannot be null");
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct( productoCrudRepository.save(producto));
    }
    @Override
    public void delete(int productId) {
        productoCrudRepository.deleteById(productId);
    }

}
