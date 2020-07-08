package Modelos;

import java.time.LocalDateTime;
import java.util.*;

public class Receta {

	protected Paciente paciente;
	protected LocalDateTime fecha;
	protected Doctor doctor;
	protected Collection<Medicamento> medicamentos;
	protected PlanNutricional planNut;

}