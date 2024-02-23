
import com.google.protobuf.TextFormat.ParseException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.util.Date;
import logica.Auto;
import logica.Inspeccion;
import logica.Inspector;
import logica.Propietario;
import logica.Validador;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Ian
 */
public class Tests {

    private EntityManager entityManager;

    @BeforeEach
    public void empezarTransaccion() {
        entityManager = Persistence.createEntityManagerFactory("vtvPU").createEntityManager();
        entityManager.getTransaction().begin();
    }

    @AfterEach
    public void terminarTransaccion() {
        entityManager.getTransaction().rollback();
        entityManager.close();
    }

    @Test
    public void testAutoPersistencia() {

        Propietario propietario = new Propietario();
        propietario.setNombre("Ian");
        propietario.setApellido("Sein");
        propietario.setDni(44760184);
        propietario.setTelefono(1141775449);
        entityManager.persist(propietario);

        Auto auto = new Auto();
        auto.setDominio("JSKDN2");
        auto.setMarca("Chevrolet");
        auto.setModelo("Cruze");
        auto.setPropietario(propietario);
        entityManager.persist(auto);

        entityManager.flush();
        entityManager.clear();

        Auto autoPersisted = entityManager.find(Auto.class, auto.getId());
        assertNotNull(autoPersisted);
        assertEquals("JSKDN2", autoPersisted.getDominio());
        assertNotNull(autoPersisted.getPropietario());
        assertEquals("Ian", autoPersisted.getPropietario().getNombre());
        assertEquals("Chevrolet", autoPersisted.getMarca());
        assertEquals("Cruze", autoPersisted.getModelo());
    }

    @Test
    public void testInspectorPersistencia() {
        Inspector inspector = new Inspector();
        inspector.setNombre("Mia");
        inspector.setApellido("Peralta");
        inspector.setDni(2323123);
        inspector.setTelefono(2323231);
        inspector.setNroInspector(1);

        entityManager.persist(inspector);
        entityManager.flush();
        entityManager.clear();

        Inspector inspectorPersistido = entityManager.find(Inspector.class, inspector.getId());

        assertNotNull(inspectorPersistido);
        assertEquals("Mia", inspectorPersistido.getNombre());
        assertEquals("Peralta", inspectorPersistido.getApellido());
        assertEquals(2323123, inspectorPersistido.getDni());
        assertEquals(2323231, inspectorPersistido.getTelefono());
        assertEquals(1, inspectorPersistido.getNroInspector());
    }

    @Test
    public void testGetFechaInspeccionFormateada() throws ParseException, java.text.ParseException {
        Inspeccion inspeccion = new Inspeccion();

        String fechaString = "2022-02-21 3:00:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaInspeccion = dateFormat.parse(fechaString);
        inspeccion.setFechaInspeccion(fechaInspeccion);

        String fechaFormateada = inspeccion.getFechaInspeccionFormateada();

        assertEquals("21/02/2022", fechaFormateada);
    }

    @Test
    public void testInspeccion() {
        Inspector inspector = new Inspector();
        inspector.setId(1);
        inspector.setNombre("Sherlock");
        inspector.setApellido("Hernandez");
        inspector.setTelefono(5555555);
        inspector.setDni(1111111);
        inspector.setNroInspector(500);

        Auto auto = new Auto();
        auto.setId(1);
        auto.setDominio("LK8J9");
        auto.setMarca("Ferrari");
        auto.setModelo("GT5");
        
        Inspeccion inspeccion = new Inspeccion();
        inspeccion.setId(1);
        inspeccion.setNumeroInspeccion(900);
        inspeccion.setFechaInspeccion(new Date());
        inspeccion.setEstadoInspeccion("Aprobada");
        inspeccion.setExento(true);
        inspeccion.setInspector(inspector);
        inspeccion.setAutoInspeccionado(auto);

        assertEquals(1, inspeccion.getId());
        assertEquals(900, inspeccion.getNumeroInspeccion());
        assertEquals("Aprobada", inspeccion.getEstadoInspeccion());
        assertEquals("Si", inspeccion.isExento());


        assertEquals(1, inspeccion.getInspector().getId());
        assertEquals("Sherlock", inspeccion.getInspector().getNombre());
        assertEquals("Hernandez", inspeccion.getInspector().getApellido());
        assertEquals(5555555, inspeccion.getInspector().getTelefono());
        assertEquals(1111111, inspeccion.getInspector().getDni());
        assertEquals(500, inspeccion.getInspector().getNroInspector());

        assertEquals(1, inspeccion.getAutoInspeccionado().getId());
        assertEquals("LK8J9", inspeccion.getAutoInspeccionado().getDominio());
        assertEquals("Ferrari", inspeccion.getAutoInspeccionado().getMarca());
        assertEquals("GT5", inspeccion.getAutoInspeccionado().getModelo());
    }
    
    @Test
    public void testEsTextoNoVacio() {
        assertTrue(Validador.esTextoNoVacio("Hola"));
        assertTrue(Validador.esTextoNoVacio("  Hola  "));
        assertFalse(Validador.esTextoNoVacio(null));
        assertFalse(Validador.esTextoNoVacio(""));
        assertFalse(Validador.esTextoNoVacio("    "));
    }

    @Test
    public void testEsNumero() {
        assertTrue(Validador.esNumero("123"));
        assertFalse(Validador.esNumero(null));
        assertFalse(Validador.esNumero(""));
        assertFalse(Validador.esNumero("abc"));
        assertFalse(Validador.esNumero("12a"));
    }

}
