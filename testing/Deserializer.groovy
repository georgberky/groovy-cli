class Deserializer {

    private def incrementer

    Deserializer(Incrementer incrementer) {
        this.incrementer = incrementer
    }

    Integer deserialize(String line) {
        try {
            def deserialized = Integer.parseInt(line?.trim())
            
            return incrementer.increment(deserialized)
        }
        catch(NumberFormatException e) {
            System.err.println("Received malformed message: '${line}'")
        }
    }
}
