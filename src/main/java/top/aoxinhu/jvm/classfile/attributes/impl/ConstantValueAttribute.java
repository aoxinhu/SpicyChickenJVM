package top.aoxinhu.jvm.classfile.attributes.impl;

import top.aoxinhu.jvm.classfile.ClassReader;
import top.aoxinhu.jvm.classfile.attributes.AttributeInfo;

/**
 * @Author Ziyang Guo
 * @Date 2021-03-02 21:55
 */
public class ConstantValueAttribute implements AttributeInfo {

    private int constantValueIdx;

    @Override
    public void readInfo(ClassReader reader) {
        this.constantValueIdx = reader.readUint16();
    }

    public int constantValueIdx(){
        return this.constantValueIdx;
    }

}
