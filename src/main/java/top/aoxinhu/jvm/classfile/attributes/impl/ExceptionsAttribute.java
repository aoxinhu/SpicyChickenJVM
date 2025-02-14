package top.aoxinhu.jvm.classfile.attributes.impl;

import top.aoxinhu.jvm.classfile.ClassReader;
import top.aoxinhu.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author Ziyang Guo
 * @Date 2021-03-02 21:55
 */
public class ExceptionsAttribute implements AttributeInfo {

    private int[] exceptionIndexTable;

    @Override
    public void readInfo(ClassReader reader) {
        this.exceptionIndexTable = reader.readUint16s();
    }

    public int[] exceptionIndexTable(){
        return this.exceptionIndexTable;
    }

}
