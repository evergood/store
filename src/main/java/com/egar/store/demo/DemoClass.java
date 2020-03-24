package com.egar.store.demo;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;

@Getter
@Setter
@ManagedBean(name = "demo")
public class DemoClass {
    private String name = "buzzfizz";
}
