Repository pattern


ORM -> Hibernate (JPA spec)


Spring Start ;
1) Spring initialiser
  1.a)Spring Web
  1.b)PostgreSQL Driver
  1.c)Spring Data JpaRepository
  1.d)SpringBoot DevTools
2) application.properties
    -Datasource and Postgres settings \n
    spring.datasource.url=jdbc:postgresql://localhost:5432/{DBNAME}\n
    spring.datasource.username=user\n
    spring.datasource.password=\n
    spring.jpa.hibernate.ddl-auto=update\n
    spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL9Dialect /n
    spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true /n
3)Models \n
4)Repositories \n
5)RestController \n


com.example.....
  |- controllers \n
    |- modelController (Class)

  |- models \n
    |- modelClass (Class)

  |- Repositories\n
    |- modelRepository (Interface)

  |- nameApplication

Resources\n
  |- application.properties


Testing\n
  |- testFiles



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





Repository
______________________________

//JpaRepository is kinda like a HashMap

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


\\@Autowired  -> Dependency injection (making a "instance" for us , can be interface)





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
