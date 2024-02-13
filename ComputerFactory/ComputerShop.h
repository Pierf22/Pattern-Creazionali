//
// Created by Pierf on 19/11/2023.
//

#ifndef COMPUTERFACTORY_COMPUTERSHOP_H
#define COMPUTERFACTORY_COMPUTERSHOP_H
#include "ComputerFactory/ComputerPrototypeFactory.h"
class Computer{   //Un computer può avere quattro banchi di prototypeRam, ha una CPU ed una GPU
    SamsungRAM* ram;
    CPU* cpu;
    GPU* gpu;
    int number;
public:


    Computer(SamsungRAM *ram, CPU* cpu, GPU* gpu);

    void printStats();
};
class ComputerShop {


public:
    Computer createComputer(const ComputerPrototypeFactory & f);
};


#endif //COMPUTERFACTORY_COMPUTERSHOP_H
