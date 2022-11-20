package top.aoxinhu.jvm.classfile.constantpool.impl;

import top.aoxinhu.jvm.classfile.ClassReader;
import top.aoxinhu.jvm.classfile.constantpool.ConstantInfo;

/**
 * @Author Ziyang Guo
 * @Date 2021-03-02 21:36
 * @Description long 类型的字面值
 */
public class ConstantLongInfo implements ConstantInfo {

    private long val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = reader.readUint64TLong();
    }

    @Override
    public int tag() {
        return this.CONSTANT_TAG_LONG;
    }

    public long value(){
        return this.val;
    }

}
