package com.egar.store.util;

import com.egar.store.domen.ItemPack;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IUnmarshallingContext;

import java.io.FileInputStream;

public class Parser {
    public static void main(String[] args) throws Exception {
        IBindingFactory bfact = BindingDirectory.getFactory(ItemPack.class);
        IUnmarshallingContext uctx = bfact.createUnmarshallingContext();
        ItemPack itemPack = (ItemPack) uctx.unmarshalDocument(new FileInputStream("items.xml"), null);

        System.out.println(itemPack.toString());

    }
}
