//
// Created by Pierf on 18/11/2023.
//

#ifndef COMPUTERFACTORY_COMPUTERPROTOTYPEFACTORY_H
#define COMPUTERFACTORY_COMPUTERPROTOTYPEFACTORY_H


#include "../Components/CPU.h"
#include "../Components/GPU.h"
#include "../Components/SamsungRAM.h"

class ComputerPrototypeFactory {
private:



    CPU* prototypeCpu;
    GPU* prototypeGpu;
    SamsungRAM* prototypeRam;
public:
    ComputerPrototypeFactory(CPU *c, GPU *g, SamsungRAM *r);
    virtual CPU* MakeCPU() const;
    virtual GPU* MakeGPU() const;
    virtual SamsungRAM* MakeRAM() const;

};


#endif //COMPUTERFACTORY_COMPUTERPROTOTYPEFACTORY_H
