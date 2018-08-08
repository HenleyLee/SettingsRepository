#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#parse("File Header.java")
#if (${VISIBILITY} == "PUBLIC")public #end class ${NAME} #if (${SUPERCLASS} != "")extends ${SUPERCLASS} #end #if (${INTERFACES} != "")implements ${INTERFACES} #end {
    
    private static class SingletonHolder {
        private static final ${NAME} INSTANCE = new ${NAME}();
    }

    #if (${VISIBILITY} == "PUBLIC")public #end static ${NAME} getInstance() {       
        return SingletonHolder.INSTANCE;
    }

    private ${NAME}() {
    }
    
}