package projeto1.exemplos;

//import java.util.Random;
import java.util.Scanner;

class Item{
	public int valor;
	public Item proximo;
	public Item anterior;

	public Item(int valor) {
		this.valor = valor;	
	}

	@Override
	public String toString() {
		return "Item [valor=" + valor + "]";
	}


}

public class ListaEncadeada {
	
	static Item lista = null;	   	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		 

		int sair = 0;
		/*	   Integer valor = s.nextInt();

	   Item itemAtual2 = lista;

	   while(itemAtual2 != null) {

		   if(valor.equals(itemAtual2.valor)) {
			   System.out.println(itemAtual2);

			   if (itemAtual2.proximo != null) {
				   System.out.println(itemAtual2.proximo);
			   }
			   break;
		   }
		   itemAtual2 = itemAtual2.proximo;
	   }*/
		do {
			System.out.println("Escolha uma das opções: \n1 - Inserir item\n2 - Remover um item\n3 - Limpar lista\n4 - Ordenar\n5 - Sair");
			int opcao = s.nextInt();

			if (opcao == 1) {
				adicionarItem();
				imprimirLista();
			} else if (opcao == 2) {
				removerItem();
				imprimirLista();
			} else if (opcao == 3) {
				limparLista();
				imprimirLista();
			} else if (opcao == 4) {
				ordenarLista();
				imprimirLista();
			} else {
				sair = opcao;
			}
		
		} while(sair != 5); 

		System.exit(0);
		
	}	

	public static Item getUltimoItem() {
		if (lista == null) {
			return null;
		}
		
		Item item = lista;
		
		while(item.proximo != null) {
			item = item.proximo;
		}
		return item;
		
	}
	
	public static void adicionarItem() {
		System.out.println("Digite o valor a ser adicionado");
		Item ultimoItem = getUltimoItem();
		Item novoItem = new Item(s.nextInt());
		if (lista == null) {
			lista = novoItem;
		} else {
			novoItem.anterior = ultimoItem;
			ultimoItem.proximo = novoItem;
		}
	}
	
	
	public static void removerItem() {
		System.out.println("Digite o valor a ser removido");
		Integer valor1 = s.nextInt();
		Item itemAtual3 = lista;
		
		while(itemAtual3 != null) {
			
			if(valor1.equals(itemAtual3.valor) ) {
					if (itemAtual3.anterior == null) {
						lista = itemAtual3.proximo;
						lista.anterior = null;
						
					} else {
						itemAtual3.anterior.proximo = itemAtual3.proximo;
						itemAtual3.proximo.anterior = itemAtual3.anterior;
					}
					break;
			}
			
			itemAtual3 = itemAtual3.proximo;
		}		
	}
	
	
	public static void limparLista() {
		lista = null;
	}
	
	
	public static void ordenarLista(){
		
		Item  itemNew = lista;
		Item itemLista = lista;
		Item menor;
		
		while (itemLista.proximo != null) {
			
			menor = itemLista;
			while (itemNew.proximo != null) {
				if (menor.valor> itemNew.proximo.valor) {
					menor = itemNew.proximo;
				}
				itemNew = itemNew.proximo;
			}
			
			if (itemLista == lista) {
				lista = menor;
			}
			
			if (itemLista.proximo == null) {
				break;
			} else if (itemLista != menor) {
				troca(itemLista, menor);
			}
			itemLista = menor.proximo;
			itemNew = itemLista;
		
			
		}
		
		
		
	}
	
	public static void troca(Item base, Item menor) {
		
		Item listaAux = new Item(0);
		listaAux.anterior = menor.anterior;
		listaAux.proximo = menor.proximo;
		
		/*menor*/
		if(base.anterior != null) {
			base.anterior.proximo = menor;
		}
		if (base.proximo != menor) {
			base.proximo.anterior = menor;
		}
        
        menor.anterior = base.anterior;
        
        if (base.proximo == menor) {
        	menor.proximo = base;
        }else{
        	menor.proximo = base.proximo;
        }
        
        /*base*/
        
        if (listaAux.anterior != base) {
        	listaAux.anterior.proximo = base;
        }
        
        if (listaAux.proximo != null) {
        	listaAux.proximo.anterior = base;
        }
        
        if (listaAux.anterior == base) {
        	base.anterior = menor;
        }else {
        	base.anterior = listaAux.anterior;
        }
        
        base.proximo = listaAux.proximo;                

		
	}
	
	
	public static void imprimirLista() {
		Item itemPercorre = lista;
		System.out.println();
		
		while(itemPercorre != null) {
			System.out.println(itemPercorre);
			itemPercorre = itemPercorre.proximo;
		}
		System.out.println();
	}
	
}
