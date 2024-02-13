#include <iostream>
#include "ComputerShop.h"
#include "Components/CPU.h"
#include "Components/AmdCPU.h"
#include "Components/IntelCPU.h"
#include "Components/NvidiaGPU.h"

int main() {
    ComputerShop shop;
    //fabbrica di prototipi 1
    ComputerPrototypeFactory AMDComputerFactory(new AmdCPU, new GPU, new SamsungRAM);
    //fabbrica di prototipi 2
    ComputerPrototypeFactory IntelComputerFactory(new IntelCPU, new NvidiaGPU, new SamsungRAM);

    Computer computer1=shop.createComputer(AMDComputerFactory);

    computer1.printStats();
    std::cout<<"------------------------\n";
    Computer computer2=shop.createComputer(AMDComputerFactory);

    computer2.printStats();
    std::cout<<"------------------------\n";  //creo un Computer con oggetti diversi a tempo di programmazione
    Computer computer3=shop.createComputer(IntelComputerFactory);
    computer3.printStats();


    return 0;
}
