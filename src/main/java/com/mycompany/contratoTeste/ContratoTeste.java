package com.mycompany.contratoTeste;

import com.mycompany.contratoTeste.entidade.Cliente;
import com.mycompany.contratoTeste.entidade.Contrato;
import com.mycompany.contratoTeste.repositorio.ClienteDao;
import com.mycompany.contratoTeste.repositorio.ContratoDao;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Caixa
 */
public class ContratoTeste {

    public static void main(String[] args) {

//<editor-fold defaultstate="collapsed" desc="testes deleteById">
        // Recuperar todos os objetos
        List<Cliente> clientes = new ClienteDao().findAll();
        System.out.println(">> " + clientes);

        // Recuperar todos os objetos
        List<Contrato> contratos = new ContratoDao().findAll();
        System.out.println(">> " + contratos);

        for (Contrato c : contratos) {
            new ContratoDao().deleteById(c.getId());
        }

        for (Cliente c : clientes) {
            new ClienteDao().deleteById(c.getId());
        }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="testes saveOrUpdate">
        Cliente cliente = new Cliente("119.298.263-03", "Ana");
        System.out.println(cliente);
        long clienteId = new ClienteDao().saveOrUpdate(cliente);
        cliente.setId(clienteId);
        cliente.setNome("Ana Zaira");
        clienteId = new ClienteDao().saveOrUpdate(cliente);
        System.out.println(cliente);

        Contrato contrato = new Contrato(cliente, "Contrato por tempo determinado",
                LocalDate.parse("2023-05-21"));
        long contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);

        contrato = new Contrato(cliente, "Contrato por tempo indeterminado",
                LocalDate.parse("2023-12-01"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);
        contrato.setUltimaAtualizacao(LocalDate.parse("2023-05-01"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);

        contrato = new Contrato(cliente, "Contrato de trabalho eventual2023",
                LocalDate.parse("2023-05-26"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);
        contrato.setRedacao("Contrato de trabalho eventual");
        contratoId = new ContratoDao().saveOrUpdate(contrato);

//////////////////////////////////////////
        cliente = new Cliente("267.529.650-30", "267.529.650-30, Beatriz Yana");
        System.out.println(cliente);
        clienteId = new ClienteDao().saveOrUpdate(cliente);
        cliente.setId(clienteId);
        cliente.setNome("Beatriz Yana");
        clienteId = new ClienteDao().saveOrUpdate(cliente);
        System.out.println(cliente);

        contrato = new Contrato(cliente, "Contrato de estágio",
                LocalDate.parse("2023-10-15"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);

        contrato = new Contrato(cliente, "Contrato de experiência",
                LocalDate.parse("2023-05-01"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);
        contrato.setUltimaAtualizacao(LocalDate.parse("2023-09-16"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);

        contrato = new Contrato(cliente, "Contrato de teletrabalho, 17/08/2023",
                LocalDate.parse("2023-08-17"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);
        contrato.setRedacao("Contrato de teletrabalho");
        contratoId = new ContratoDao().saveOrUpdate(contrato);

        contrato = new Contrato(cliente, "Contrato intermitente",
                LocalDate.parse("2023-07-15"));
        contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="teste findAll">
        // Recuperar todos os objetos
        clientes = new ClienteDao().findAll();
        System.out.println(">> " + clientes);

        // Recuperar todos os objetos
        contratos = new ContratoDao().findAll();
        System.out.println(">> " + contratos);

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="teste findById">
        for (Cliente c : clientes) {
            cliente = new ClienteDao().findById(c.getId());
            System.out.println(">> " + cliente);
        }

        for (Contrato c : contratos) {
            contrato = new ContratoDao().findById(c.getId());
            System.out.println(">> " + contrato);
        }
//</editor-fold>
    }
}
