package Main;

import java.io.Serializable;
import javax.swing.tree.DefaultMutableTreeNode;

public class Binario implements Serializable {

    private DefaultMutableTreeNode uml;
    private DefaultMutableTreeNode sql;

    public Binario() {
    }

    public Binario(DefaultMutableTreeNode uml, DefaultMutableTreeNode sql) {
        this.uml = uml;
        this.sql = sql;
    }

    public DefaultMutableTreeNode getSql() {
        return sql;
    }

    public void setSql(DefaultMutableTreeNode sql) {
        this.sql = sql;
    }

    public DefaultMutableTreeNode getUml() {
        return uml;
    }

    public void setUml(DefaultMutableTreeNode uml) {
        this.uml = uml;
    }

}
