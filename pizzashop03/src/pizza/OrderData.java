package pizza;
 
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OrderData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String kind;
    
    @Persistent
    private String size;
     
    @Persistent
    private int number;
    
    @Persistent
    private String name;
    
    @Persistent
    private String address;
     
    @Persistent
    private Date datetime;
 
    public OrderData(String kind, String size, int number, String name, String address, Date datetime) {
        super();
        this.kind = kind;
        this.size = size;
        this.number = number;
        this.name = name;
        this.address = address;
        this.datetime = datetime;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getKind() {
        return kind;
    }
 
    public void setKind(String kind) {
        this.kind = kind;
    }
    
    public String getSize() {
        return size;
    }
 
    public void setSize(String size) {
        this.size = size;
    }
    
    public int getNumber() {
        return number;
    }
 
    public void setNumber(int number) {
        this.number = number;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}