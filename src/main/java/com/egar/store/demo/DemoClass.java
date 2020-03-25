package com.egar.store.demo;

import lombok.Getter;
import lombok.Setter;

import javax.inject.Named;

@Getter
@Setter
@Named
public class DemoClass {
    private String name = "buzzfizz";
}
