//
// Created by Pierf on 19/11/2023.
//

#ifndef COMPUTERFACTORY_INTELCPU_H
#define COMPUTERFACTORY_INTELCPU_H
#include "CPU.h"
class IntelCPU : public CPU{
public:
    IntelCPU(const IntelCPU&);
    IntelCPU();




    IntelCPU *Clone() const override;

    std::string getType() override;

    void initialize() override;
};







#endif //COMPUTERFACTORY_INTELCPU_H
