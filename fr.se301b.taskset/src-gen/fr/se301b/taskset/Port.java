/**
 */
package fr.se301b.taskset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.se301b.taskset.Port#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.se301b.taskset.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see fr.se301b.taskset.TasksetPackage#getPort_Direction()
	 * @model required="true"
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.se301b.taskset.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see fr.se301b.taskset.DataType
	 * @see #setDataType(DataType)
	 * @see fr.se301b.taskset.TasksetPackage#getPort_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Port#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see fr.se301b.taskset.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

} // Port
