package top.aoxinhu.jvm.classfile.attributes.impl;

import top.aoxinhu.jvm.classfile.ClassReader;
import top.aoxinhu.jvm.classfile.attributes.AttributeInfo;
import top.aoxinhu.jvm.classfile.constantpool.ConstantPool;

/**
 * @Author Ziyang Guo
 * @Date 2021-03-02 21:56
 */
public class SignatureAttribute implements AttributeInfo {

    private ConstantPool constantPool;
    private int signatureIdx;

    public SignatureAttribute(ConstantPool constantPool) {
          this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.signatureIdx = reader.readUint16();
    }

    public String signature(){
        return this.constantPool.getUTF8(this.signatureIdx);
    }

}
