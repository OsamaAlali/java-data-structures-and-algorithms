package trees;

import org.checkerframework.checker.units.qual.K;

public class KAry {

    int value;
    KAry child[];

    public KAry() {
    }

    public KAry(int value,int vchild) {
        this.value = value;
        child=new KAry[vchild];
    }

}
