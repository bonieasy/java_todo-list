package com.bonifacio.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users") //entidade do banco de dados - tabela
public class UserModal {

    @Id//identificador da chave primaria
    @GeneratedValue(generator = "UUID")//aqui estou pedindo para gerar um valor automatico
    private UUID id;

    //@Column(name = "usuario")//caso eu queira mudar o nome da coluna no banco de dados, eu uso essa anotacao, no caso ele ja vai criar as colunas com o mesmo nome do atributo
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    //metodos getter e setter - Metodos para acessar atributos privados
    //get - pegar o valor
    //set - setar o valor

    // public void setUsername(String username) {
    //     this.username = username; //cria um metodo para setar/inserir o valor do atributo
    // }

    // public String getUsername() { //cria um metodo para pegar/buscar o valor do atributo
    //     return username;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getName() {
    //     return name;
    // }
    
    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getPassword() {
    //     return password;
    // }
}
