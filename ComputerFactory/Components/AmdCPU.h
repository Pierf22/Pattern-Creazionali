//
// Created by Pierf on 19/11/2023.
//

#ifndef COMPUTERFACTORY_AMDCPU_H
#define COMPUTERFACTORY_AMDCPU_H

#include "CPU.h"

class AmdCPU : public CPU{
public:
    AmdCPU();
    AmdCPU(const AmdCPU &);



    [[nodiscard]] AmdCPU* Clone() const override;


private:


    void initialize() override ;

    std::string getType() override;
};


#endif //COMPUTERFACTORY_AMDCPU_H
