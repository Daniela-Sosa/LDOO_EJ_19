package FACTORY;

public class factory {
 
 private final String UsuarioAD;
 private final String UsuarioINV;
 private final String UsuarioPLN;
 private static factory mifactory;
 
 public  static factory getfactory(String edoo,String inv,String pln) {
 
 if (mifactory==null) {
 
 mifactory = new factory(edoo,inv, pln);
 }
 return mifactory;
 }
    private String edoo;
    private String inv;
    private String pln;
 
 private factory(String edoo,String inv, String pln){
 
 this.UsuarioAD = edoo;
 this.UsuarioINV = inv;
 this.UsuarioPLN = pln;
 
 }

    public factory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
public String getUsuarioAD() {
 return edoo;
 }
 
public void setUsuarioAD(String edoo) {
 this.edoo = edoo;
 }
 
public String getUsuarioINV() {
 return inv;
 }
 
public void setUsuarioINV(String inv) {
 this.inv = inv;
 }

public String getUsuarioPLN() {
 return pln;
 }

public void setUsuarioPLN(String pln) {
 this.pln = pln;
 }

}

