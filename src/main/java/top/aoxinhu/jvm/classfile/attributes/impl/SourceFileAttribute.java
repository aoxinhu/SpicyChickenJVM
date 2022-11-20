package top.aoxinhu.jvm.classfile.attributes.impl;

import top.aoxinhu.jvm.classfile.ClassReader;
import top.aoxinhu.jvm.classfile.attributes.AttributeInfo;
import top.aoxinhu.jvm.classfile.constantpool.ConstantPool;

/**
 * @Author Ziyang Guo
 * @Date 2021-03-02 21:56
 */
public class SourceFileAttribute implements AttributeInfo {

    private ConstantPool constantPool;
    private int sourceFileIdx;

    public SourceFileAttribute(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.sourceFileIdx = reader.readUint16();
    }

    public String fileName(){
        return this.constantPool.getUTF8(this.sourceFileIdx);
    }

}
