package com.example.forme.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.context.MessageSource;

import lombok.var;

public class JustForFun {
    private MessageSource messageSource;

    public void Boo() {
        var codeZh = messageSource.getMessage("code", null, Constants.localeZh);
        new QueryWrapper<Example>().lambda()
                .orderByDesc(Example::getName);
    }
}
