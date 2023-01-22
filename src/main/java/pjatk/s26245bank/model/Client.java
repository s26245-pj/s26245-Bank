package pjatk.s26245bank.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private int id;
    private String name;
    private String lastName;
    private long balance;
    private double  bankAccountNr;

}
