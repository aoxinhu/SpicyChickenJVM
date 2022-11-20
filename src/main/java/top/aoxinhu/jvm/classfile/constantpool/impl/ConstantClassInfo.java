package top.aoxinhu.jvm.classfile.constantpool.impl;

import top.aoxinhu.jvm.classfile.ClassReader;
import top.aoxinhu.jvm.classfile.constantpool.ConstantInfo;
import top.aoxinhu.jvm.classfile.constantpool.ConstantPool;

/**
 * @Description 对一个类或接口的符号引用
 */
public class ConstantClassInfo implements ConstantInfo {

    public ConstantPool constantPool;
    public int nameIdx;

    public ConstantClassInfo(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.nameIdx = reader.readUint16();
    }

    public String name(){
        return this.constantPool.getUTF8(this.nameIdx);
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_CLASS;
    }

}
