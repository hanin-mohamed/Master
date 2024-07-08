import java.util.*;
import java.io.*;
import javax.validation.*;
import lombok.*;
@Entity
@Table
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor

public class Customer {
   private String name;
   private String phone;
   private String email;
   private String password;

}
