package com.example.demo.Service;

import com.example.demo.Dto.ProdutoDto;
import com.example.demo.Model.Produto;
import com.example.demo.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public List<ProdutoDto> findAll() {
        List<Produto> rsproduto = produtoRepository.findAll();
        return rsproduto.stream().map(ProdutoDto::from).collect(Collectors.toList());
    }

    public ProdutoDto save(ProdutoDto produtoDto) {

        if (produtoRepository.findByNameContaining(produtoDto.getName()).isPresent()) {
            produtoDto.getName();

        }
        return ProdutoDto.from(produtoRepository.save(new Produto(produtoDto.getName(), produtoDto.getValor())));
    }
}
