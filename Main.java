import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sensor temperatura =
            new SensorTemperatura(
                "T001",
                "Zona Norte"
            );

        Sensor humedad =
            new SensorHumedad(
                "H001",
                "Zona Norte"
            );

        Sensor calidadAire =
            new SensorCalidadAire(
                "A001",
                "Zona Sur"
            );

        Sensor sensor4 =
            new SensorLuminosidad(
                "L001",
                "Zona Sur"
            );

        List<Sensor> sensores =
            new ArrayList<>();

        sensores.add(temperatura);
sensores.add(humedad);
sensores.add(calidadAire);
sensores.add(sensor4);

Zona zonaSur = new Zona("Zona Sur");
zonaSur.agregarSensor(sensor4);

EstacionMonitoreo estacion =
    new EstacionMonitoreo("Estacion Principal");

estacion.monitorear(sensor4);
        for (Sensor sensor : sensores) {

            sensor.activar();

            System.out.println(
                sensor.getId()
                + " → "
                + sensor.leer()
            );

            sensor.registrarLectura();
        }
    }
}