package com.sipc.ep1_FactoryMode.factoryPattern;

import com.sipc.ep1_FactoryMode.factoryPattern.Factory.GifReaderFactory;
import com.sipc.ep1_FactoryMode.factoryPattern.Factory.JpgReaderFactory;
import com.sipc.ep1_FactoryMode.factoryPattern.Factory.ReaderFactory;
import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.Reader;

public class demo {
    public static void main(String[] args) {
        ReaderFactory readerFactory = new JpgReaderFactory();
        Reader reader = readerFactory.getReader();
        reader.read();
        ReaderFactory readerFactory1 = new GifReaderFactory();
        Reader reader1 = readerFactory1.getReader();
        reader1.read();
    }
}
