################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/Hello\ World.cpp 

CPP_DEPS += \
./src/Hello\ World.d 

OBJS += \
./src/Hello\ World.o 


# Each subdirectory must supply rules for building sources it contributes
src/Hello\ World.o: ../src/Hello\ World.cpp src/subdir.mk
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"src/Hello World.d" -MT"$@" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


clean: clean-src

clean-src:
	-$(RM) ./src/Hello\ World.d ./src/Hello\ World.o

.PHONY: clean-src

