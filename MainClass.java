/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuliah.pbo.teori;

/**
 *
 * @author asus
 */
public class MainClass extends PembayaranBlanja{
    public static void main(String[] args) {
        PembayaranBlanja pb = new PembayaranBlanja();
        
        double kembalian = pb.bayarCash(50000, 10000);
        System.out.println("Kembalian: " + kembalian);
        
        double sisaEwallet = pb.bayarEwallet(12222, 5000, 400);
        System.out.println("Sisa Saldo E-Wallet: " + sisaEwallet);
        
        double sisaKreditCard = pb.bayarKreditCard(60000, 9000, 8000);
        System.out.println("Sisa Saldo Kredit Card: " + sisaKreditCard);
        
        double sisaShopee = pb.bayarShopee(3000, 30000, 6000);
        System.out.println("Sisa Saldo Shopie: " + sisaShopee);
    }
}


