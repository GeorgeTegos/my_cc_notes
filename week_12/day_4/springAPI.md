#Backend REST API setup


Repository pattern
ORM -> Hibernate (JPA spec)


Spring Start ;
1. Spring initialiser
    - Spring Web ( https://start.spring.io/ )
    * PostgreSQL Driver
    * Spring Data JpaRepository
    * SpringBoot DevTools
1. application.properties
    - // Datasource and Postgres settings
    * spring.datasource.url=jdbc:postgresql://localhost:5432/{DBNAME}
    * spring.datasource.username=user
    * spring.datasource.password=
    * spring.jpa.hibernate.ddl-auto=update
    * spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect
    * spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
1. Models
1. Repositories
1. RestController


____________________________________

com.example.....
* controllers (Package)
    - |- modelController (Class)

* models (Package)
    - |- modelClass (Class)

* Repositories (Package)
    - |- modelRepository (Interface)

* nameApplication

* Resources (Folder)
    - application.properties


* Testing (Folder)
    - |- testFiles

____________________________________


MODEL
__________________________

```
@Entity
@Table(name="XXX")
public class NAME{

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "age")
  private int age;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;  --> Has to BE LONG

  contrustor(){
  }

  EMPTY contrustor(){}

    getters + setters
}
```
______________________________





Every Model has to be in Repository

Repositories should always be Interface
______________________________

JpaRepository is kinda like a HashMap

Repository

```
@Repository
public interface INTERFACE_NAME extends JpaRepository<Pirate, Long>{

}
```
_______________________________





Testing
_______________________________

```

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PirateserviceApplicationTests {

	@Autowired //Dependency Injection
	PirateRepository pirateRepository;

	 Pirate jack ;

	@BeforeAll
	public void setup(){
		jack = new Pirate("Jack","Sparrow",32);
	}


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		pirateRepository.save(jack);
	}

	@Test
	public void deletePirate(){
		pirateRepository.deleteById(1L);

	}
}
```
______________________________

@Autowired  -> Dependency injection (making a "instance" for us , can be interface)

REST API Controller
_________________________________
@GetMapping       GET \n
@PostMapping      CREATE \n
@DeleteMapping    DELETE \n
@PutMapping       UPDATE \n
@PatchMapping \n


Controller
______________________________
```
@RestController
public class PirateController {
    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value = "/pirates")
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

    @GetMapping(value = "/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }

    @PostMapping(value = "/pirates")
  public Pirate createPirate(@RequestBody Pirate pirate){
      return pirateRepository.save(pirate);
  }

  @DeleteMapping(value = "/pirates/{id}")
   public void deletePirate(@PathVariable Long id){
       pirateRepository.deleteById(id);
   }


   @PutMapping(value = "/pirates/{id}")
    public Pirate replacePirate(@PathVariable Long id,@RequestBody Pirate newPirate){
        return pirateRepository.findById(id).map(pirate -> {
            pirate.setFirstName(newPirate.getFirstName());
            pirate.setLastName(newPirate.getLastName());
            pirate.setAge(newPirate.getAge());
            return pirateRepository.save(pirate);
        }).orElseGet(() -> {
            newPirate.setId(id); //No need
            return pirateRepository.save(newPirate);
        });
    }
}
```
____________________________________


# GLOBAL CORS CONFIG
```
@Configuration
public class SpringGlobalConfig implements WebMvcConfigurer {

    private static final String CORS_BASE_PATTERN = "/**";
    private static final String ALLOWED_ORIGINS = "*";
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(CORS_BASE_PATTERN)
                .allowedOrigins(ALLOWED_ORIGINS)
                .allowedHeaders(ALLOWED_HEADERS)
                .allowedMethods(ALLOWED_METHODS);
    }
}
```
