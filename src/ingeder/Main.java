package ingeder;
import ingeder.Cajera;
import ingeder.Cliente;


/**
 *
 * @author Usuario
 */
public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("CHOCA", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("PACO", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente3 = new Cliente("JUAN", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente4 = new Cliente("ESTEV", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente5 = new Cliente("PATO", new int[] { 1, 3, 5, 1, 1 });

		Cajera cajera1 = new Cajera("Cajera Adriana");
		Cajera cajera2 = new Cajera("Cajera Maria");
                Cajera cajera3 = new Cajera("Cajera Ana");
                Cajera cajera4 = new Cajera("Cajera Juana");
                Cajera cajera5 = new Cajera("Cajera Joaquina");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
	}

}
