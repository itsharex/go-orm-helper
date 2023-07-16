package com.github.maiqingqiang.goormhelper.sql2struct.impl;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.ast.statement.SQLColumnDefinition;
import org.jetbrains.annotations.NotNull;

public class SQL2GoFrameStruct extends SQL2Struct {
    public SQL2GoFrameStruct(String sql, DbType dbType) {
        super(sql, dbType);
    }

    @Override
    protected void generateORMTag(@NotNull StringBuilder stringBuilder, @NotNull SQLColumnDefinition definition) {
        stringBuilder.append("orm:\"");

        stringBuilder.append(getColumn(definition));

        stringBuilder.append("\" ");
    }
}
