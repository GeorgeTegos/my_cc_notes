import React from "react";
import Calculator from "../containers/Calculator";
import { render, fireEvent } from "@testing-library/react";
import KeyPad from "../components/KeyPad";

describe("Calculator", () => {
  let container;
  beforeEach(() => {
    container = render(<Calculator />);
  });

  it("should change running total on number enter", () => {
    const button4 = container.getByTestId("number4");
    const runningTotal = container.getByTestId("running-total");
    fireEvent.click(button4);
    expect(runningTotal.textContent).toEqual("4");
  });

  it("should change the running total to 5", () => {
    const button4 = container.getByTestId("number4");
    const button1 = container.getByTestId("number1");
    const runningTotal = container.getByTestId("running-total");
    fireEvent.click(button4);
    const addOperator = container.getByTestId("operator-add");
    const equalsOperator = container.getByTestId("operator-equals");
    fireEvent.click(addOperator);
    fireEvent.click(button1);
    fireEvent.click(equalsOperator);
    expect(runningTotal.textContent).toEqual("5");
  });

  it("should change the running total to 3", () => {
    const button7 = container.getByTestId("number7");
    const button4 = container.getByTestId("number4");
    const runningTotal = container.getByTestId("running-total");
    fireEvent.click(button7);
    const subtractOperator = container.getByTestId("operator-subtract");
    const equalsOperator = container.getByTestId("operator-equals");
    fireEvent.click(subtractOperator);
    fireEvent.click(button4);
    fireEvent.click(equalsOperator);
    expect(runningTotal.textContent).toEqual("3");
  });

  it("should change the running total to 15", () => {
    const button3 = container.getByTestId("number3");
    const button5 = container.getByTestId("number5");
    const runningTotal = container.getByTestId("running-total");
    fireEvent.click(button3);
    const multiplyOperator = container.getByTestId("operator-multiply");
    const equalsOperator = container.getByTestId("operator-equals");
    fireEvent.click(multiplyOperator);
    fireEvent.click(button5);
    fireEvent.click(equalsOperator);
    expect(runningTotal.textContent).toEqual("15");
  });
});
