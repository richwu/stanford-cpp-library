/*
 * Test file for verifying the Stanford C++ lib functionality.
 */

#include "console.h"
#include "random.h"
#include "simpio.h"
#include "strlib.h"
#include "test/testcases.h"
#include "private/version.h"
#include <iostream>
using namespace std;

int main() {
    setConsoleSize(1000, 600);
    setConsoleLocation(-1, -1);
    setConsoleWindowTitle("Marty is great");
    
//    cout << randomInteger(1, 10) << " "
//         << randomInteger(1, 10) << " "
//         << randomInteger(1, 10) << endl;
    
    while (true) {
        cout << "c) collections" << endl;
        cout << "e) cout / cerr mix" << endl;
        cout << "g) gui" << endl;
        cout << "i) cin / cout" << endl;
        cout << "n) segfault (NULL ptr)" << endl;
        cout << "o) stack overflow" << endl;
        cout << "p) pipe" << endl;
        cout << "s) strings" << endl;
        cout << "t) throw exception" << endl;
        cout << "u) urlstream" << endl;
        string cmd = getLine("Command (Enter to quit)?");
        if (cmd.empty()) {
            break;
        } else if (cmd == "c") {
            randomElementTest();
            compareTest();
            foreachTest();
            hashCodeTest();
        } else if (cmd == "e") {
            coutCerrMixTest();
        } else if (cmd == "g") {
            // fileDialogTest();
            gbufferedImageTest();
            // goptionpaneTest();
        } else if (cmd == "i") {
            // cinOutTest();
            killProcessTest();
        } else if (cmd == "n") {
            segfaultTest();
        } else if (cmd == "p") {
            outputColorTest();
            cinOutTest();
            coutCerrMixTest();
            getIntegerTest();
            longStringTest();
            // killProcessTest();
        } else if (cmd == "o") {
            //getPlatform()->setStackSize(1024*1024*128);
            stackOverflowTest();
        } else if (cmd == "s") {
            stringToIntegerTest();
        } else if (cmd == "t") {
            exceptionTest();
        } else if (cmd == "u") {
            urlstreamTest();
        }
    }
    
    std::cout << "Complete." << std::endl;
    return 0;
}
