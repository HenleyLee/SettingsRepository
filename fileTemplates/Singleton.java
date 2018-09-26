#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

#if (${IMPORT_BLOCK} != "")${IMPORT_BLOCK}
#end
#parse("File Header.java")
#if (${VISIBILITY} == "PUBLIC")public #end class ${NAME} #if (${SUPERCLASS} != "")extends ${SUPERCLASS} #end #if (${INTERFACES} != "")implements ${INTERFACES} #end {
    
    private volatile static ${NAME} INSTANCE;

    #if (${VISIBILITY} == "PUBLIC")public #end static ${NAME} getInstance() {
        if (INSTANCE == null) {
            synchronized (${NAME}.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ${NAME}();
                }
            }
        }
        return INSTANCE;
    }

    private ${NAME}() {
    }
    
}
