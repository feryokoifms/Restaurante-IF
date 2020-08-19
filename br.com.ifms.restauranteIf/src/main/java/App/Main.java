
package main.java.App;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main{

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
		@SuppressWarnings("unused")
		EntityManager manager = factory.createEntityManager();
	}
}


/*
   ----------configurar tomcat-----------
adicionar as 3 libs
criar novo projeto maven "web app"
botao direito no projeto/configure/convert to JFS
Baixar tomcat v 9.0
mudar perspectiva para java EE e na aba inferior"server"uewe
configurar tomcat apontando p/ pasta de instancia que baixou

pasta webapp/web-inf/web.xml , login.jsf
pasta webapp/web-inf/web.xml , index.html
pasta webapp/web-inf/web.xml , index.html, cadProdutos.jsf
webapp/img/imagem.jpg
*/