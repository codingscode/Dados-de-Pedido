package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidades.Cliente;
import model.entidades.ItemPedido;
import model.entidades.Pedido;
import model.entidades.Produto;
import model.enums.PedidoStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com dados do cliente: ");
		System.out.println("Nome : ");
		String nomecliente = sc.next();
		System.out.println("Email : ");
		String email = sc.next();
		System.out.println("Ano de nascimento : ");
		Date aniversario = sdf.parse(sc.next());
		Cliente cliente = new Cliente(nomecliente, email, aniversario);
		
		System.out.println("Entre com dados do pedido: ");
		System.out.println("Status : ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos itens a este Pedido : ");
		int n = sc.nextInt();
		for (int i=0; i<n;i++) {
		  System.out.println("Digite #" + (i+1) + " item dados :");
		  System.out.print("Nome do Produto : ");
		  sc.nextLine();
		  String nomeprod = sc.nextLine();
		  System.out.print("Preço do Produto : ");
		  double precoprod = sc.nextDouble();
		  
		  Produto produto = new Produto(nomeprod, precoprod);
		  
		  System.out.print("Quantidade : ");
		  int quantidade = sc.nextInt();
		  
		  ItemPedido itempedido = new ItemPedido(quantidade, precoprod, produto);
		  
		  pedido.addItem(itempedido);			
		}
		System.out.println();
		System.out.println("Sumário do Pedido");
		System.out.println(pedido);
		
        sc.close();
	}

}
