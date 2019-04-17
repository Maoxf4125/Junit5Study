package com.maoxf.listener;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.Set;

public class TagListener implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context){
        Set<String> tags = context.getTags();

        //不执行注解@Tag = Fast的测试case
        if (tags.contains("Fast")){
            return ConditionEvaluationResult.disabled("测试不执行");
        } else {
            return ConditionEvaluationResult.enabled("测试执行");
        }
    }
}
