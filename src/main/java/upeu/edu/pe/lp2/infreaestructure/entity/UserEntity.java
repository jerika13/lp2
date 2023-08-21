/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.edu.pe.lp2.infreaestructure.entity;
import jakarta.persistence.*;

/**
 *
 * @author jerik
 */
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username:
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String cellphone;
    private String password;
    
    
}
