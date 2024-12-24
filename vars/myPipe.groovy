/**
 * This is a custom pipeline step for demonstrating shared libraries.
 * @param message Message to print
 */
def call(String message = 'Hello from my custom pipeline step!') {
    echo "myPipelineStep says: ${message}"
}
