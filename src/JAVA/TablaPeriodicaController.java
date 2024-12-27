@Controller
public class TablaPeriodicaController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/api/elementos")
    @ResponseBody
    public List<Elemento> getElementos() {
        TablaPeriodica tabla = new TablaPeriodica();
        return tabla.getElementos();
    }
    
    @PostMapping("/api/reaccion")
    @ResponseBody
    public String calcularReaccion(@RequestBody ReaccionRequest request) {
        // Implementar la lógica de reacciones aquí
        return "Resultado de la reacción";
    }
}