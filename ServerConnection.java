class ServerConnection {

    private String ipAddress;

    // Constructor
    ServerConnection(String ipAddress) {
        this.ipAddress = ipAddress;
        System.out.println("Connection opened to " + ipAddress);
    }

    // finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Connection closed for " + ipAddress + ". Memory freed.");
    }

    public static void main(String[] args) {

        // Create object inside a block scope
        {
            ServerConnection connection =
                    new ServerConnection("192.168.1.10");
        }

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}