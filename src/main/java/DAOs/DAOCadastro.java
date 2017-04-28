package DAOs;


import Entidades.Cadastro;
import java.util.ArrayList;
import java.util.List;

public class DAOCadastro extends DAOGenerico<Cadastro> {

    public DAOCadastro() {
        super(Cadastro.class);
    }

    public int autoIdCadastro() {
        Integer a = (Integer) em.createQuery("SELECT MAX(e.idCadastro) FROM Cadastro e ").getSingleResult();
        if (a != null) {
            return a + 1;
        } else {
            return 1;
        }
    }

    public List<Cadastro> listByNome(String nome) {
        return em.createQuery("SELECT e FROM Cadastro e WHERE e.senha LIKE :nome").setParameter("nome", nome ).getResultList();
    }

    public List<Cadastro> listById(int id) {
        return em.createQuery("SELECT e FROM Cadastro e WHERE e.senha = :id").setParameter("id", id).getResultList();
    }

    public List<Cadastro> listInOrderNome() {
        return em.createQuery("SELECT e FROM Cadastro e ORDER BY e.nomeCadastro").getResultList();
    }

    public List<Cadastro> listInOrderId() {
        return em.createQuery("SELECT e FROM Cadastro e ORDER BY e.idCadastro").getResultList();
    }

    public List<String> listInOrderNomeStrings(String qualOrdem) {
        List<Cadastro> lf;
        if (qualOrdem.equals("id")) {
            lf = listInOrderId();
        } else {
            lf = listInOrderNome();
        }

        List<String> ls = new ArrayList<>();
        for (int i = 0; i < lf.size(); i++) {
            ls.add(lf.get(i).getSenha()+ "-" + lf.get(i).getNome());
        }
        return ls;
    }

   

   
}

