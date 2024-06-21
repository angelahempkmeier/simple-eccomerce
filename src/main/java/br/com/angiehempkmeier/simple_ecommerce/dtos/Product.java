package br.com.angiehempkmeier.simple_ecommerce.dtos;

import java.io.Serializable;

public record Product(Long id, String name, String description) implements Serializable {
}
