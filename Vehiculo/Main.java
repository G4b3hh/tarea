public class Main {
    public static void main(String[] args) {
        VehículoTerrestre vehiculoTerrestre = new VehículoTerrestre(120, 4, "civil");
        vehiculoTerrestre.acelerar(50);
        vehiculoTerrestre.imprimir();

        VehículoAcuático vehiculoAcuatico = new VehículoAcuático(80, "superficie", 10);
        vehiculoAcuatico.acelerar(70);
        vehiculoAcuatico.imprimir();
        vehiculoAcuatico.recomendarVelocidad(90);
        vehiculoAcuatico.imprimir();
    }
}