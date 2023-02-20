/**
 * This module is the "client" module, and it contains this package:
 * com.entertainment.client
 *
 * As the client module, it does not export anything.
 */

module com.entertainment.client {
    // what other "modules" does this module depend on?
    // This module will get access to the public classes in the exported packages.
    requires com.entertainment;  // this is a "module" name
}